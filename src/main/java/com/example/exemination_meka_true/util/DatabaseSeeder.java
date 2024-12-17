package com.example.exemination_meka_true.util;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseSeeder {

    public static void seedDatabase() {
        try (Connection connection = DatabaseUtil.getConnection();
             Statement statement = connection.createStatement()) {

            
            String insertSubjects = "INSERT INTO Subjects (id, name) VALUES " +
                    "(1, 'Math'), " +
                    "(2, 'Science') " +
                    "ON CONFLICT (id) DO NOTHING;";
            statement.executeUpdate(insertSubjects);

            
            String insertTests = "INSERT INTO Tests (id, subject_id, name) VALUES " +
                    "(1, 1, 'Algebra Test'), " +
                    "(2, 1, 'Calculus Test'), " +
                    "(3, 2, 'Physics Test'), " +
                    "(4, 2, 'Chemistry Test') " +
                    "ON CONFLICT (id) DO NOTHING;";
            statement.executeUpdate(insertTests);

            
            String insertQuestions = "INSERT INTO Questions (id, test_id, question_text, correct_answer) VALUES " +
                    "(1, 1, 'What is x if 2x = 6?', '3'), " +
                    "(2, 1, 'Simplify the expression: 4(x - 2) + 3(x + 1)', '7x-5'),"+
                    "(3, 1, 'What is the derivative of x^2?', '2x'), " +
                    "(4, 1, 'Expand the expression: (a + 1)(a + 3)', 'a^2+4a+3'), " +
                    "(5, 1, 'Solve the inequality: 5x - 3 > 7', 'x>2'),"+
                    "(6, 2, 'What is the sum of angles in a triangle?', '180'), " +
                    "(7, 2, 'Evaluate the limit: lim(x → 0) (sin(x) / x)', '1'),"+
                    "(8, 2, 'Evaluate the integral: ∫(x^3 + 3x^2) dx', 'F(x)=(x^4/4)+(x^3)+C'),"+
                    "(9, 2, 'Evaluate the limit: lim(x → ∞) (1 / x)', '0'),"+
                    "(10, 2, 'What is the area of a rectangle with sides 3 and 4?', '12'), " +
                    "(11, 3, 'What is the unit of force?', 'Newton'), " +
                    "(12, 3, 'What is the acceleration due to gravity on Earth?', '9.8 m/s^2'), " +
                    "(13, 3, 'What is the formula for velocity?', 'v=d/t')"+
                    "(14, 3, 'A car accelerates from 0 to 20 m/s in 5 seconds. What is its acceleration?', 'a=4 m/s^2'),"+
                    "(15, 3, 'What is the formula for acceleration?', 'a=(v-u)/t'),\n"+
                    "(16, 4, 'What is the pH of pure water?', '7') " +
                    "(17, 4, 'What is the atomic number of carbon?', '6')"+
                    "(18, 4, 'How many moles of CO₂ are in 44 grams of CO₂?', '1 mole')"+
                    "(19, 4, 'What is the empirical formula of glucose (C₆H₁₂O₆)?', 'CH2O'),"+
                    "(20, 4, 'What is the formula for calculating the density of a substance?', 'p=m/V'),"+
                    "ON CONFLICT (id) DO NOTHING;";
            statement.executeUpdate(insertQuestions);

            System.out.println("Database successfully seeded!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
