package visibilitymodifer.protectedmodifier

import visibilitymodifer.publicmodifer.A

open class A{

    protected var aProperty : String = ""

    protected fun aFunction(){}

    fun createInstanceA(){

        val a = A()
        a.aFunction()
        a.aProperty
    }
}