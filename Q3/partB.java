public ArrayList<Match> buildMatches(){
    ArrayList<Match> result = new ArrayList<Match>();
    int start = 0;
    int end = competitorList.size();
    if(end%2!=0){
        start++;
    }
    for(int i = start; i<end/2; i++){
        int c1 = competitorList.get(i);
        int c2 = competitorList.get(end-i)
        result.add(Match(c1,c2));
    }
    return result;
}
