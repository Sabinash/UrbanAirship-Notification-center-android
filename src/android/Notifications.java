package com.urbanairship.cordova;

/**
 * Created by Abinash.Sahoo on 4/5/2017.
 */

public class Notifications {
  int id;
  String message;
  String flag;
  String messageDate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public String getMessageDate() {
    return messageDate;
  }

  public void setMessageDate(String messageDate) {
    this.messageDate = messageDate;
  }

  @Override
  public String toString() {
    return "Notifications{" +
      "id=" + id +
      ", message='" + message + '\'' +
      ", flag='" + flag + '\'' +
      ", messageDate='" + messageDate + '\'' +
      '}';
  }
}
