package com.exmple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Accounting {

    private List<Socks> socksList = new ArrayList<>();

    public void arrivalOfSocks(int quantity, String color, int cottonPart){
        for (int i = 0; i < quantity; i++) {
            Socks socks = new Socks(color, cottonPart);
            socksList.add(socks);
        }
    }

    public List<Socks> departureOfSocks(String color, Operation operation, int cottonPart){
        List<Socks> socksNewList = new ArrayList<>();
        if (operation == Operation.MORE_THAN){
            for (Socks socksOne: getSocksList()) {
                if ((color == socksOne.getColor()) && (cottonPart < socksOne.getCottonPart())){
                    socksNewList.add(socksOne);
                }
            }
        } else if (operation == Operation.LESS_THAN) {
            for (Socks socksOne: getSocksList()) {
                if ((color == socksOne.getColor()) && (cottonPart > socksOne.getCottonPart())){
                    socksNewList.add(socksOne);
                }
            }
        } else if (operation == Operation.EQUAL) {
            for (Socks socksOne: getSocksList()) {
                if ((color == socksOne.getColor()) && (cottonPart == socksOne.getCottonPart())){
                    socksNewList.add(socksOne);
                }
            }
        }
        iteratorMethod(socksNewList);
        return socksNewList;
    }

    public List<Socks> departureOfSocks(String color){
        List<Socks> socksNewList = new ArrayList<>();
        for (Socks socksOne: getSocksList()) {
            if (color == socksOne.getColor()){
                socksNewList.add(socksOne);
            }
        }
        iteratorMethod(socksNewList);
        return socksNewList;
    }

    private void iteratorMethod(List<Socks> list){
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
