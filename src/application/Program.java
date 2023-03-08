package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entites.Client;

public class Program {
	
	public static void main(String[] args) {
		
		// Ordenado pelo compareTo do objeto
		Set<Client> set = new TreeSet<>();
		
		// Mantém a ordem de inserção
		Set<Client> set2 = new LinkedHashSet<>();
		
		// Não ordenado
		Set<Client> set3 = new HashSet<>();
		
		set.add(new Client("Gabriel"));
		set.add(new Client("Maria"));
		set.add(new Client("Ana"));
		
		set2.add(new Client("Pedro"));
		set2.add(new Client("Juliana"));
		set2.add(new Client("Andressa"));
		
		set3.add(new Client("Jose"));
		set3.add(new Client("Lucas"));
		set3.add(new Client("Carol"));
		
		
		
		for(Client p : set) {
			System.out.println(p);
		}
		System.out.println("---------------");
		
		for(Client p : set2) {
			System.out.println(p);
		}
		System.out.println("---------------");
		
		for (Client p : set3) {
			System.out.println(p);
		}
		
	}
}
