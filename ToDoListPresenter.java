public class ToDoListPresenter {
    private ToDoListView view;
    private ToDoListModel model;
    private boolean flag;

    public ToDoListPresenter(ToDoListView view, ToDoListModel model) {
        this.model = model;
        this.view = view;
    }

    public void menu() {
        this.flag = true;
        while (flag) {
            System.out.println("1. Добавить задачу в список");
            System.out.println("2. Показать весь список задач");
            System.out.println("3. Выход");
            int choise = view.choise();
            switch (choise) {
                case 1: {
                    String task = view.takeTask();
                    model.addTask(task);
                    break;
                }
                case 2: {
                    view.showToDoList(model.getList());
                    break;
                }
                case 3: flag = false;
                break;
                default: System.out.println("Введите корректное число");
                break;
            }
        }
    }
    
}