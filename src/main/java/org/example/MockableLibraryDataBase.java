package org.example;

import java.util.ArrayList;
import java.util.List;
public class MockableLibraryDataBase implements LibraryDatabase {

    private List<Book> libros = new ArrayList<>();
    private List<Student> estudiantes = new ArrayList<>();


    @Override
    public void saveBookData(Book book) {
        libros.add(book);
    }

    @Override
    public void saveStudentData(Student student) {
        estudiantes.add(student);
    }

    @Override
    public Book getBookById(String id) {
        for (int i = 0; i <libros.size() ; i++) {
            if(id == libros.get(i).getId()){
                return libros.get(i);
            }
        }
        return null;

    }

    @Override
    public Student getStudentById(String id) {
        for (int i = 0; i <estudiantes.size() ; i++) {
            if(id == estudiantes.get(i).getId()){
                return estudiantes.get(i);
            }
        }
        return null;
    }
}
