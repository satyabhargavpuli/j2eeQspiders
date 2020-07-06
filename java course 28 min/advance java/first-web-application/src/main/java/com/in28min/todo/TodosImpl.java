package com.in28min.todo;

import java.util.ArrayList;
import java.util.List;

public class TodosImpl {

	
private static List<Todos> todoL =new  ArrayList<Todos>();
	
static {
	   todoL.add(new Todos("learn all basics"));
	   todoL.add(new Todos("learn web application programming"));
	   todoL.add(new Todos("learn spring with hibernate"));
	   todoL.add(new Todos("learn microservices"));
}
public List<Todos> retrieveTodos(){
	return todoL;
}
public void addListData(Todos add) {
	todoL.add(add);
}

public void deleteTodo(String todo) {
	todoL.remove(new Todos(todo));
}
}
