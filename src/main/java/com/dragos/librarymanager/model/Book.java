package com.dragos.librarymanager.model;

public class Book
{
    long id;
    String title;
    String author;
    int publishYear;
    String isbn;
    float price;

    void setID(long idS)
    {
        id=idS;
    }
    void setTitle(String titleS) {
        title = titleS;
    }
    void setAuthor(String authorS)
    {
        author=authorS;
    }
    void setPublishYear(int publishYears)
    {
        publishYear=publishYears;
    }
    void setISBN(String isbnS)
    {
        isbn=isbnS;
    }
    void setPrice(float priceS)
    {
        price=priceS;
    }
    long getId()
    {
        return id;
    }
    String getTitle()
    {
        return title;
    }
    String getAuthor()
    {
        return author;
    }
    int getPublishYear()
    {
        return publishYear;
    }
    String getIsbn()
    {
        return isbn;
    }
    float getPrice()
    {
        return price;
    }

    void infomationPrint()
    {
        System.out.print("The book with the ID:"+id+" has the title:"+title+" written by:"+author+" published in year:"+publishYear+
                " and international system book number:"+isbn+" listed at the price: "+price);
    }
}

