package com.ferry.access.core.domain;

import java.time.LocalDate;

public class Visita {
    private Long id;
    private LocalDate dataHora;
    private Long idMorador;
    private Long idVisitante;

    public Visita() {
    }

    public Visita(Long id, LocalDate dataHora, Long idMorador, Long idVisitante) {
        this.id = id;
        this.dataHora = dataHora;
        this.idMorador = idMorador;
        this.idVisitante = idVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public Long getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Long idMorador) {
        this.idMorador = idMorador;
    }

    public Long getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Long idVisitante) {
        this.idVisitante = idVisitante;
    }
}
