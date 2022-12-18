package dealine19_1;
public class Accounting {
    Employee[] info;
    Accounting (Employee[] list) {
        this.info = list;
    }
    public void main() {
        int l_info = this.info.length;
//        for (int i=0; i < l_info; i++) {
//            int cnt = 0;
//            int l_subord = this.info[i].subordinates.length;
//            for (int j=0; j < l_subord; j++)
//                if (this.info[i].subordinates[j].experience <=6)
//                    cnt++;
//            if (cnt > 3)
//                System.out.println(this.info[i].e_id + " gets bounty");
//        }
        for (Employee employee : this.info) {
            int cnt = 0;
            int l_subord = employee.subordinates.length;
            for (int j = 0; j < l_subord; j++)
                if (employee.subordinates[j].experience <= 6)
                    cnt++;
            if (cnt > 2)
                System.out.println("Employee with id: "+ employee.e_id + " gets bounty");
        }
    }
}
