package ua.ucu.edu.apps.task3;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        PDLReader pdl = new PDLReader();
        pdl.parse("https://github.com/SahaidakYurii/oop-lab13");
    }
}