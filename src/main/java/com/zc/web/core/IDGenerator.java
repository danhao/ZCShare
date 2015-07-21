package com.zc.web.core;


public enum IDGenerator {
    
    INSTANCE;
    
    private IdWorker idWorker;
    
    public void init(int zoneId) throws Exception {
        if(idWorker != null) {
            throw new Exception("idWorker duplicate initialized");
        }
        idWorker = new IdWorker(zoneId);
    }
    
    public long nextId() {
        if(idWorker == null) {
            return 0;
        }
        return idWorker.nextId();
    }
}
