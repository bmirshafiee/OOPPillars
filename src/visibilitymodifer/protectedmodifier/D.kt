package visibilitymodifer.protectedmodifier

class D : B(){

    fun createInstanceBProtected(){
        val a = A()
        a.createInstanceA()
    }

}