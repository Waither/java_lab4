package com.lab4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShapeDAOTest {

    private static ShapeDAO shapeDAO;
    private static SessionFactory sessionFactory;

    @BeforeAll
    static void setup() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        shapeDAO = new ShapeDAO();
    }

    @AfterAll
    static void tearDown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @AfterEach
    void afterEach() {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            session.createQuery("DELETE FROM Shape").executeUpdate();
            session.createNativeQuery("ALTER TABLE shapes AUTO_INCREMENT = 1").executeUpdate();
            transaction.commit();
        }
    }


    @Test
    void testSaveShape() {
        Shape shape = new Shape();
        shape.setId(1);
        shape.setName("Circle");

        assertDoesNotThrow(() -> shapeDAO.saveShape(shape));

        Shape retrievedShape = shapeDAO.getShape(1);
        assertNotNull(retrievedShape, "Shape should not be null");
        assertEquals("Circle", retrievedShape.getName(), "Name should match the saved value");
    }

    @Test
    void testSaveShapeDuplicateId() {
        Shape shape1 = new Shape();
        shape1.setId(1);
        shape1.setName("Circle");

        Shape shape2 = new Shape();
        shape2.setId(1);
        shape2.setName("Square");

        shapeDAO.saveShape(shape1);

        Exception exception = assertThrows(RuntimeException.class, () -> shapeDAO.saveShape(shape2));

        if (exception instanceof IllegalArgumentException) {
            assertTrue(exception.getMessage().contains("already exists"), "Exception message should indicate duplicate ID");
        }
        else if (exception instanceof IllegalStateException) {
            assertTrue(exception.getMessage().contains("is closed"), "Unexpected exception type: " + exception.getMessage());
        }
        else {
            fail("Unexpected exception type thrown: " + exception.getClass().getName());
        }
    }

    @Test
    void testGetShape() {
        Shape shape = new Shape();
        shape.setId(1);
        shape.setName("Circle");

        shapeDAO.saveShape(shape);
        Shape retrievedShape = shapeDAO.getShape(1);

        assertNotNull(retrievedShape, "Shape should not be null");
        assertEquals("Circle", retrievedShape.getName(), "Name should match the saved value");
    }

    @Test
    void testUpdateShape() {
        Shape shape = new Shape();
        shape.setId(1);
        shape.setName("Circle");

        shapeDAO.saveShape(shape);
        shape.setName("Updated Circle");
        shapeDAO.updateShape(shape);

        Shape updatedShape = shapeDAO.getShape(1);
        assertNotNull(updatedShape, "Updated shape should not be null");
        assertEquals("Updated Circle", updatedShape.getName(), "Name should match the updated value");
    }

    @Test
    void testDeleteShape() {
        Shape shape = new Shape();
        shape.setId(1);
        shape.setName("Circle");

        shapeDAO.saveShape(shape);
        shapeDAO.deleteShape(shape);

        Shape deletedShape = shapeDAO.getShape(1);
        assertNull(deletedShape, "Shape should be null after deletion");
    }
}
