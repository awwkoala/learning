package com.github.awwkoala.learning.paycheck;

import lombok.Getter;

@Getter
public abstract class Employee {

  /*  Tworzymy aplikację do zarządzania wypłatami pracowników w pewnej firmie. Istnieją dwa typy pracowników:
    pracownicy pełnoetatowi - otrzymują oni stałą, comiesięczną wypłatę.
    Dodatkowo na koniec roku wypłacany jest im bonus w wysokości 5% rocznego dochodu.
    pracownicy niepełnoetatowi - ich wypłata wyliczana jest na podstawie ustalonej liczby godzin i stawki godzinowej.
    Przykładowo ktoś może być zatrudniony w wymiarze 20 godzin miesięcznie ze stawką 80zł/h.
    W przyszłości mogą pojawić się także inne formy zatrudnienia z inną strategią wyliczania pensji.
    Napisz aplikację, w której zdefiniujesz tablicę (zrobię tu listę, bo w sklepie była tablica :)) z kilkoma pracownikami różnego typu.
    Następnie:
    wyświetl informację o wszystkich pracownikach,
    oblicz szacowany koszt miesięczny i roczny wypłat wszystkich pracowników.*/
  private String name;
  private String surname;
  private String job;

  public Employee(String name, String surname, String job) {
    this.name = name;
    this.surname = surname;
    this.job = job;
  }

  public abstract String getType();

  public abstract double getAnnualCost();

}
