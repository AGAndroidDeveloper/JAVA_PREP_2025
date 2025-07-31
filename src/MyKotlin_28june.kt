class MyKotlin28june(val a: Int,val b: String) {
    private var c = -1;
    fun sum() : Int{
        return a+10;
    }

    init {
        println("init block called")
        print("c "+c)
    }


    constructor(a : Int,b: String,c: Int) : this(a,b) {
        this.c = c;
    }
}

