class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // int flag = 0;
        // long numOfZ = Arrays.stream(students).filter(num -> num == 0).count();
        // long numOfO = Arrays.stream(students).filter(num -> num == 1).count();
        // long numOfZ1 = Arrays.stream(sandwiches).filter(num -> num == 0).count();
        // long numOfO1 = Arrays.stream(sandiwiches).filter(num -> num == 1).count();
        // if((numOfZ + numOfO) == (numOfZ1 + numOfO)) return 0;
        // else{
        //     for(int i =0;i<students.length;i++){
        //         if(sandwiches[i] == 1 && flag == 0) {
        //             numOfO--;
        //             if(numOfO == 0){
        //                 flag = 1;
        //             }
        //         }
        //         else if(sandwiches[i] == 0 && flag == 0){
        //             numOfZ--;
        //             if(numOfZ == 0) {
        //                 flag = 1;
        //             }
        //         } 
        //     }
        //     return (int)(numOfZ + numOfO);
        // }
        long studentWith0 = Arrays.stream(students).filter(num -> num==0).count();
        int studentWith1 = students.length  - (int)studentWith0;
        for(int sandwich : sandwiches){
            if(studentWith0 == 0 && sandwich == 0){
                return studentWith1;
            }
            else if(studentWith1 == 0 && sandwich == 1){
                return (int)studentWith0;
            }
            if(sandwich==1) studentWith1--;
            else studentWith0--;
        }
        return 0;
    }
}