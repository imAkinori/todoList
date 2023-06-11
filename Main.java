
public class Main {
    private String person;
    private int[] numberList;
    private String[] todoList;

    public Main(String name) {
        this.person = name;
    }

    public void getToDoList() {
        String lista = "";
        for (int i=0; i < this.numberList.length; i++) {
            lista += this.numberList[i] + "" + this.todoList[i];
        }
        System.out.println(lista);
    }

}