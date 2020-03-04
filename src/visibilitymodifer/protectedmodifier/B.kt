package visibilitymodifer.protectedmodifier

open class B{

    fun createInstanceAProtected(){
        val a = A()
        a.createInstanceA()
    }
}