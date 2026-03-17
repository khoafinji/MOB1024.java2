package Lab1_b2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("NV1", "Vo Huu Phuoc", 5000000));
        list.add(new FullTimeEmployee("NV2", "Nguyen Dang Khoa", 4000000, 200000, 100000));
        list.add(new FullTimeEmployee("NV3", "Tran Hoai Phuong", 3500000, 500000, 0));
        list.add(new PartTimeEmployee("NV4", "Tran Van Son", 22000, 8, 24));
        list.add(new PartTimeEmployee("NV5", "Phan Van Quyen", 25000, 12, 30));
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString() + " | Income:" + list.get(i).income());
        }
        
        Employee max = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i).income() > max.income()){
                max = list.get(i);
            }
        }
        
        System.out.println("\n Nhan vien co luong cao nhat:");
        System.out.println(max.toString() + " | Income:" + max.income());
    }
}
