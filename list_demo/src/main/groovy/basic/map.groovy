package basic

class map {
    public static void main(String[] args) {
        def student = [ name: "Oanh", age : 21]
        println student

        def student2 = [:]
        student2.put("name",'oanh')
        student2['surname'] = 'pham'
        student2<< [age:21]
        student2.class = '12A1'
        student2.'School' = "TQP"
        println student2

        def studentName = [name: 'Katty', "age": 21]
        def stduetnSchool = [school: "TQP"]
        def st3 = [age: 22, faculty :"IT"]
        println studentName+stduetnSchool+st3
    }
}
