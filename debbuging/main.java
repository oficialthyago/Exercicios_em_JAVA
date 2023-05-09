package br.com.dio.debbuging

    public class main
public static void main(String[]args){
    system.out.println("Inicio do programa no método main");

    a()
    system.out.println("Finalizou o método main");

}
public static void a(String[]args){
    system.out.println("Inicio do programa no método a");

    b()
    system.out.println("Finalizou o método a");

}
public static void b(String[]args){
    system.out.println("Inicio do programa no método b");
    for(int i =, i<=4 , i++) system.out.println(i)
    c()
    system.out.println("Finalizou o método b");

    }
public static void c(String[]args){
    system.out.println("Inicio do programa no método c");
    thread.dumpStack();
                system.out.println("Finalizou o método c");

            }