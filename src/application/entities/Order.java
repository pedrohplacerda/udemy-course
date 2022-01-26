package application.entities;

import application.entities.enums.WorkerLevel;

import java.util.Date;

public class Order {

    private Integer id;
    private Date moment;
    private WorkerLevel status;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(WorkerLevel status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public WorkerLevel getStatus() {
        return status;
    }

    public Order(Integer id, Date moment, WorkerLevel status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
}
