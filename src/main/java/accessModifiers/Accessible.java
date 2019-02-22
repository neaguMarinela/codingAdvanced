package accessModifiers;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
