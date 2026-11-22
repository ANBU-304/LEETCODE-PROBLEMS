bool checkString(char* s) {
    int n = (int)strlen(s);
    for(int i=1;i<n;i++)
    {
        if(s[i-1]>s[i])
        {
            return false;
        }
    }

    return true;
}