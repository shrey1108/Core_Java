class BlankFinalVariable
{
    final String adhar;//Blank final variable
    public BlankFinalVariable(String adhar)
    {
        this. adhar=adhar;
    }     /*public void setAdhar(String adhar)
    {
        this.adhar=adhar;// can't assign the value to the blank final variable
    }*/
    public static void main(String[] args)
    {
        BlankFinalVariable bfv=new BlankFinalVariable();
        bfv.setAdhar("12345");
    }
}