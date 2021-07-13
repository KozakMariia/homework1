package com.betterme.homework5_1;

import com.betterme.homework5_1.DocumentWorker;

class ExpertDocumentWorker extends DocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}

