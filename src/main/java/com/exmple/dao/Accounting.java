package com.exmple.dao;

import com.exmple.entity.Socks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Accounting {

    private List<Socks> socksList = new ArrayList<Socks>();

    public void arrivalOfSocks(int quantity, String color, int cottonPart){
        if (quantity != 0)  {
            for (int index = 1; index <= quantity; index++) {
                socksList.add(new Socks(color, cottonPart));
            }
        } else {
            System.out.println("Добавлять нечего!");
        }
    }

    public List<Socks> sortSocksMethod(String color, List<Socks> socksNewList){
        for (Socks socksOne: getSocksList()) {
            if (color != socksOne.getColor()) {
                socksNewList.remove(socksOne);
            }
        }
        return socksNewList;
    }

    public List<Socks> departureOfSocks(String color, Operation operation, int cottonPart){
        List<Socks> socksNewList = new ArrayList<Socks>();

        switch (operation) {
            case MORE_THAN:
                for (Socks socksOne: getSocksList()) {
                    if (cottonPart < socksOne.getCottonPart()){
                        socksNewList.add(socksOne);
                    }
                }
                break;
            case LESS_THAN:
                for (Socks socksOne: getSocksList()) {
                    if (cottonPart > socksOne.getCottonPart()){
                        socksNewList.add(socksOne);
                    }
                }
                break;
            case EQUAL:
                for (Socks socksOne: getSocksList()) {
                    if (cottonPart == socksOne.getCottonPart()){
                        socksNewList.add(socksOne);
                    }
                }
                break;
        }
        sortSocksMethod(color, socksNewList);
        iteratorMethod(socksNewList);
        if (socksNewList.size() == 0){
            System.out.println("Таких носков нет!");
        }
        return socksNewList;
    }

    public List<Socks> departureOfSocks(String color){
        List<Socks> socksNewList = new ArrayList<Socks>();
        for (Socks socksOne: getSocksList()) {
            if (color == socksOne.getColor()){
                socksNewList.add(socksOne);
            }
        }
        if (socksNewList.size() == 0){
            System.out.println("Таких носков нет!");
        }
        iteratorMethod(socksNewList);
        return socksNewList;
    }

    public void iteratorMethod(List<Socks> list){
        Iterator<Socks> socksIterator = socksList.iterator();
        while (socksIterator.hasNext()){
            Socks nextSocks = socksIterator.next();
            for (Socks s: list) {
                if (s == nextSocks) socksIterator.remove();
            }
        }
    }

    public List<Socks> getSocksList() {
        return socksList;
    }

    public void setSocksList(List<Socks> socksList) {
        this.socksList = socksList;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "socksList=" + socksList +
                '}';
    }
}
