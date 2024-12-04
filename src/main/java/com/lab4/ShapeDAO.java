package com.lab4;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ShapeDAO {

    public void saveShape(Shape shape) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Shape existingShape = session.get(Shape.class, shape.getId());
            if (existingShape != null) {
                throw new IllegalArgumentException("Shape with ID " + shape.getId() + " already exists.");
            }

            session.save(shape);
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public Shape getShape(int id) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            return session.get(Shape.class, id);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateShape(Shape shape) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(shape);
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteShape(Shape shape) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(shape);
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
