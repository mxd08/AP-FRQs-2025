public int walkDogs(int hour){
    int companyDogs = numAvailableDogs(hour);
    if(maxDogs>companyDogs){
        updateDogs(hour,companyDogs);
        return companyDogs;
    }
    updateDogs(hour,maxDogs);
    return maxDogs;
}
