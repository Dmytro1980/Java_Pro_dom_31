package org.example;


import org.example.dao.StudentDao;

public class Main {
    public static void main(String[] args) {

        // добавление записей
        StudentDao.addUser("Tom", "tom@gmail.com");
        StudentDao.addUser("Bob", "bob@gmail.com");
        StudentDao.addUser("Jack", "jack@gmail.com");
        StudentDao.addUser("Bill", "bill@gmail.com");

        // получение всех записей
        StudentDao.getAll();

        // получение записи по имени
        StudentDao.getByName("Bob");

        StudentDao.getByName("John");

        // получение записи по id
        StudentDao.getByID(2);

        StudentDao.getByID(134);

        // изменится только имя
        StudentDao.updateById(1,"Alex","");

        // измениться имя и почта
        StudentDao.updateById(2,"Phil","phil@gmail.com");

        // измениться почта
        StudentDao.updateById(3,"","newmail@gmail.com");

        // изменений не будет
        StudentDao.updateById(4,"","");

        StudentDao.getAll();

        // удаление записи
        StudentDao.deleteById(1);
        StudentDao.getAll();
    }
}