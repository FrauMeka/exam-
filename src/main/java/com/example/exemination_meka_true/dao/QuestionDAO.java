package com.example.exemination_meka_true.dao;

import com.example.exemination_meka_true.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {

    public List<Question> findAllByTestId(int testId) {
        List<Question> questions = new ArrayList<>();

        switch (testId) {
            case 1: // Algebra Test
                questions.add(new Question(1, 1, "What is x if 2x = 6?", "3"));
                questions.add(new Question(2, 1, "Simplify the expression: 4(x - 2) + 3(x + 1)", "7x-5"));
                questions.add(new Question(3, 1, "What is the derivative of x^2?", "2x"));
                questions.add(new Question(4, 1, "Expand the expression: (a + 1)(a + 3)", "a^2+4a+3"));
                questions.add(new Question(5, 1, "Solve the inequality: 5x - 3 > 7", "x>2"));
                break;
            case 2: // Geometry Test
                questions.add(new Question(6, 2, "What is the sum of angles in a triangle?", "180"));
                questions.add(new Question(7, 2, "Evaluate the limit: lim(x → 0) (sin(x) / x)", "1"));
                questions.add(new Question(8, 2, "Evaluate the integral: ∫(x^3 + 3x^2) dx", "F(x)=(x^4/4)+(x^3)+C"));
                questions.add(new Question(9, 2, "Evaluate the limit: lim(x → ∞) (1 / x)", "0"));
                questions.add(new Question(10, 2, "What is the area of a rectangle with sides 3 and 4?", "12"));
                break;
            case 3: // Physics Test
                questions.add(new Question(11, 3, "What is the unit of force?", "Newton"));
                questions.add(new Question(12, 3, "What is the acceleration due to gravity on Earth?", "9.8m/s^2"));
                questions.add(new Question(13, 3, "What is the formula for velocity?", "v=d/t"));
                questions.add(new Question(14, 3, "A car accelerates from 0 to 20 m/s in 5 seconds. What is its acceleration?", "a=4 m/s^2"));
                questions.add(new Question(15, 3, "What is the formula for acceleration?", "a=(v-u)/t"));
                break;
            case 4: // Chemistry Test
                questions.add(new Question(16, 4, "What is the pH of pure water?", "7"));
                questions.add(new Question(17, 4, "What is the atomic number of carbon?", "6"));
                questions.add(new Question(18, 4, "How many moles of CO₂ are in 44 grams of CO₂?", "1 mole"));
                questions.add(new Question(19, 4, "What is the empirical formula of glucose (C₆H₁₂O₆)?", "CH2O"));
                questions.add(new Question(20, 4, "What is the formula for calculating the density of a substance?", "p=m/V"));
                break;
            default:
                System.out.println("No questions available for the given test ID.");
        }

        return questions;
    }
}