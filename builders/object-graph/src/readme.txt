

Book
--------------
title
description
sections
chapters

Section
--------------
name
chapters

Chapter
--------------
name


public Book createBook(){

    Book b = new Book(title:"My Book",description:"This is my brand new book");
    Section s = new Section("Part 1")

    Chapter c1 = new Chapter("Chapter 1")
    Chapter c2 = new Chapter("Chapter 2")
    s.getChapters().add(c1)
    s.getChapters().add(c2)

    b.getSections().add(s)

    return b;
}

BookBuilder builder = new BookBuilder()
Book.build {
    sections("Part 1"){
        chapter("Chapter 1"){

        }
    }
}

// ObjectGraphBuilder
