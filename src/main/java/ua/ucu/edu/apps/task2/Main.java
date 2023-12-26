package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        Auth go = new Auth();
        if (go.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
