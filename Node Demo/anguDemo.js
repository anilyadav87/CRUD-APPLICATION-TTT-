var Employee = /** @class */ (function () {
    function Employee() {
        this.fName = 'ANIL';
    }
    /*
        constructor(Eid : number,fname : string, lname : string)
        {
            this.eId = Eid;
            this.fName =fname;
            this.lName = lname;
        }*/
    Employee.prototype.disp = function () {
        return this.fName;
    };
    return Employee;
}());
//var employee = new Employee(1,'anil','yadav');
var employee = new Employee();
console.log(employee);
console.log(employee.disp());
