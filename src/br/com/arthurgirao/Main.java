package br.com.arthurgirao;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.add("1");
        listaCircular.add("2");
        listaCircular.add("3");
        listaCircular.add("4");
        listaCircular.add("5");
        listaCircular.add("6");
        listaCircular.add("7");
        listaCircular.add("8");

        System.out.println(listaCircular);
        System.out.println(listaCircular.get(0));


    }
}