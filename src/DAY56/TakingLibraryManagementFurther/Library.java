package DAY56.TakingLibraryManagementFurther;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import java.util.function.Consumer;

import java.util.function.Function;

import java.util.function.Predicate;

import java.util.function.Supplier;

import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> bookList;
    private ArrayList<User> users;

    public Library () {
        bookList = new ArrayList<>();
        users = new ArrayList<>();
    }

}
