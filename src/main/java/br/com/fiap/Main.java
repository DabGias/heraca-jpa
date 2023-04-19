package br.com.fiap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    final static EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory(
            LocalDate.now().getDayOfWeek() != DayOfWeek.WEDNESDAY ? "maria-db" : "oracle"
    );
    final static EntityManager MANAGER = FACTORY.createEntityManager();

    public static void main(String[] args) {

    }
}
