package com.example.publicationapp.data

import com.example.publicationapp.model.Author
import com.example.publicationapp.model.Book
import com.example.publicationapp.model.Quote

object DataSource {
    val quotesList = listOf<Quote>(
        Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
        Quote("Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill"),
        Quote("In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"),
        Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"),
        Quote("Do not wait to strike till the iron is hot, but make it hot by striking.", "William Butler Yeats"),
        Quote("The best way to predict the future is to create it.", "Peter Drucker"),
        Quote("It always seems impossible until it's done.", "Nelson Mandela"),
        Quote("The only limit to our realization of tomorrow will be our doubts of today.", "Franklin D. Roosevelt"),
        Quote("Success is stumbling from failure to failure with no loss of enthusiasm.", "Winston S. Churchill"),
        Quote("Life is what happens when you're busy making other plans.", "Allen Saunders")
    )

    val authorsList = listOf(
        Author("1", "Jane Austen", listOf("Pride and Prejudice", "Sense and Sensibility")),
        Author("2", "F. Scott Fitzgerald", listOf("The Great Gatsby", "Tender Is the Night")),
        Author("3", "George Orwell", listOf("1984", "Animal Farm")),
        Author("4", "J.K. Rowling", listOf("Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets")),
        Author("5", "Leo Tolstoy", listOf("War and Peace", "Anna Karenina")),
        Author("6", "Mark Twain", listOf("The Adventures of Tom Sawyer", "Adventures of Huckleberry Finn")),
        Author("7", "J.R.R. Tolkien", listOf("The Hobbit", "The Lord of the Rings")),
        Author("8", "Agatha Christie", listOf("Murder on the Orient Express", "Death on the Nile")),
        Author("9", "Stephen King", listOf("The Shining", "It")),
        Author("10", "Ernest Hemingway", listOf("The Old Man and the Sea", "A Farewell to Arms"))
    )

    val booksList = listOf(
        Book("1", "The Great Gatsby", "F. Scott Fitzgerald"),
        Book("2", "To Kill a Mockingbird", "Harper Lee"),
        Book("3", "1984", "George Orwell"),
        Book("4", "Pride and Prejudice", "Jane Austen"),
        Book("5", "The Catcher in the Rye", "J.D. Salinger"),
        Book("6", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
        Book("7", "The Hobbit", "J.R.R. Tolkien"),
        Book("8", "The Lord of the Rings", "J.R.R. Tolkien"),
        Book("9", "The Da Vinci Code", "Dan Brown"),
        Book("10", "The Hunger Games", "Suzanne Collins")
    )
}
