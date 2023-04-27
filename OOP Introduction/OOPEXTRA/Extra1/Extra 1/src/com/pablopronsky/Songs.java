package com.pablopronsky;

public class Songs {
  private String title;
  private String author;

  public Songs() {
    this.title = "";
    this.author = "";
  }

  public Songs(String title, String author) {
    this.setTitle(title);
    this.setAuthor(author);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
