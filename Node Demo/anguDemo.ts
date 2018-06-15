class Employee{

    private eId   : number;
    private fName : string = 'ANIL';
    private lName : string;
/*
    constructor(Eid : number,fname : string, lname : string)
    {
        this.eId = Eid;
        this.fName =fname;
        this.lName = lname;
    }*/
    disp():string{
        return this.fName;
    }
}
//var employee = new Employee(1,'anil','yadav');
var employee = new Employee();
console.log(employee);
console.log(employee.disp());