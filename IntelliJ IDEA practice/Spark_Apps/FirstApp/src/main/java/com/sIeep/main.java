package com.sIeep;

import static spark.Spark.*;

public class main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/", (request, response) -> "Hello students!" );
    }
}
