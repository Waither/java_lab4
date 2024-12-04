package com.lab4;

public class Main {
    public static void main(String[] args) {
        ShapeDAO shapeDAO = new ShapeDAO();

        Shape circle = new Shape("Circle", 12.56);
        shapeDAO.saveShape(circle);
        System.out.println("Zapisano ksztalt: " + circle.getName() + " o powierzchni: " + circle.getArea() + "\n");

        Shape retrievedCircle = shapeDAO.getShape(circle.getId());
        if (retrievedCircle != null) {
            System.out.println("Pobrano ksztalt: " + retrievedCircle.getName() + " o powierzchni: " + retrievedCircle.getArea() + "\n");
        }

        if (retrievedCircle != null) {
            retrievedCircle.setName("Updated Circle");
            retrievedCircle.setArea(15.75);
            shapeDAO.updateShape(retrievedCircle);
            System.out.println("Zaktualizowano ksztalt: " + retrievedCircle.getName() + " o powierzchni: " + retrievedCircle.getArea() + "\n");
        }

        Shape updatedCircle = shapeDAO.getShape(circle.getId());
        if (updatedCircle != null) {
            System.out.println("Zaktualizowany ksztalt (z bazy): " + updatedCircle.getName() + " o powierzchni: " + updatedCircle.getArea() + "\n");
        }

        if (updatedCircle != null) {
            shapeDAO.deleteShape(updatedCircle);
            System.out.println("Ksztalt o ID " + updatedCircle.getId() + " został pomyślnie usunięty.\n");
        }

        Shape deletedShape = shapeDAO.getShape(circle.getId());
        if (deletedShape == null) {
            System.out.println("Ksztalt o ID " + circle.getId() + " został pomyślnie usunięty z bazy danych.\n");
        }
    }
}