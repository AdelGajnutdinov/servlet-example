package ru.kai;
import javax.servlet.http.HttpServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.List;

public class PrintProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Product> productArrayList = new ArrayList <Product>();
        productArrayList.add(new Product("Apple", 100));
        productArrayList.add(new Product("Lemon", 50));
        productArrayList.add(new Product("Pineapple", 200));
        productArrayList.add(new Product("Orange", 150));

        PrintWriter printWriter = response.getWriter();
        printWriter.write("<h1>Products table:</h1>");
        printWriter.write("<table border width='150' height='50'>" +
                "<tr>" +
                "<td align='center' valign='middle'>Name</td>" +
                "<td align='center' valign='middle'>Price</td>" +
                "</tr>" +
                "</table>");
        for (Product product : productArrayList)
            printWriter.write("<table border width='150' height='50'>" +
                    "<tr>" +
                    "<td align='center' valign='middle' width='90' height='50'>" + product.getName() +"</td>" +
                    "<td align='center' valign='middle' width='90' height='50'>"+ product.getPrice() + "</td>" +
                    "</tr>" +
                    "</table>");

    }
}
