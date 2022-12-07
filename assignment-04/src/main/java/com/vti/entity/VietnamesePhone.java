package com.vti.entity;


public class VietnamesePhone extends Phone {
    public void showContact() {
        int dem = 0;
        for (Contact contactList : contacts) {
            System.out.println("contactList = "+dem++ +" : " + contactList);
        }
    }

    @Override
    public void insertContact(String name, String phone) {
        Contact contact = new Contact();
        contact.name = name;
        contact.number = phone;
        contacts.add(contact);
        showContact();
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contactless -> name.equals(contactless.getName()));
        showContact();
    }

    @Override
    public void updateContact(int index, String name, String newPhone) {
        Contact contact2 = new Contact();
        contact2.setName(name);
        contact2.setNumber(newPhone);
        contacts.set(index, contact2);
    }

    @Override
    public void searchContact(String name) {
        for (Contact contactList : contacts) {
            if (name.equals(contactList.name)){
                System.out.println("contactList = " + contactList);
            }else {
                System.out.println("không có tên này trong danh bạ");
            }
        }
    }
}




