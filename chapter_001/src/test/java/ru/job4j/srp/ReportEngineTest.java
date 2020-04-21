package ru.job4j.srp;

import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReportEngineTest {

    @Test
    public void whenGeneratedReportForITDepartment() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report html = new ReportHtml();
        Department dev = new ITDepartment();
        ReportEngine engine = new ReportEngine(store);
        StringBuilder expect = new StringBuilder()
                .append("<!DOCTYPE html>")
                .append(System.lineSeparator())
                .append("<html>")
                .append(System.lineSeparator())
                .append("<body>")
                .append(System.lineSeparator())
                .append("<p>").append("Name: ").append(worker.getName()).append(";").append("</p>")
                .append(System.lineSeparator())
                .append("<p>").append("Hired: ").append(worker.getHired()).append(";").append("</p>")
                .append(System.lineSeparator())
                .append("<p>").append("Fired: ").append(worker.getFired()).append(";").append("</p>")
                .append(System.lineSeparator())
                .append("<p>").append("Salary: ").append(worker.getSalary()).append(";").append("</p>")
                .append(System.lineSeparator())
                .append("</body>")
                .append(System.lineSeparator())
                .append("</html>")
                .append(System.lineSeparator());
        assertThat(engine.generate(em -> true, html, dev), is(expect.toString()));
    }

    @Test
    public void whenGeneratedReportForAccountDepartment() {
        double gross = 1.20;
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report text = new ReportText();
        Department acc = new AccountDepartment();
        ReportEngine engine = new ReportEngine(store);
        StringBuilder expect = new StringBuilder()
                .append("Name: ").append(worker.getName()).append(";")
                .append(System.lineSeparator())
                .append("Hired: ").append(worker.getHired()).append(";")
                .append(System.lineSeparator())
                .append("Fired: ").append(worker.getFired()).append(";")
                .append(System.lineSeparator())
                .append("Salary: ").append(worker.getSalary() * gross).append(" gross;")
                .append(System.lineSeparator());
        assertThat(engine.generate(em -> true, text, acc), is(expect.toString()));
    }

    @Test
    public void whenGeneratedReportForHRDepartment() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report text = new ReportText();
        Department hr = new HRDepartment();
        ReportEngine engine = new ReportEngine(store);
        StringBuilder expect = new StringBuilder()
                .append("Name: ").append(worker.getName()).append(";")
                .append(System.lineSeparator())
                .append("Salary: ").append(worker.getSalary()).append(";")
                .append(System.lineSeparator());
        assertThat(engine.generate(em -> true, text, hr), is(expect.toString()));
    }

    @Test
    public void whenGenerateReportForITDepartmentInXmlFormat() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report xml = new ReportXml();
        Department dev = new ITDepartment();
        ReportEngine engine = new ReportEngine(store);
        StringBuilder expect = new StringBuilder()
                .append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append(System.lineSeparator())
                .append("<report>")
                .append(System.lineSeparator())
                .append("<employee>")
                .append(System.lineSeparator())
                .append("<line>").append("Name: ").append(worker.getName()).append(";").append("</line>")
                .append(System.lineSeparator())
                .append("<line>").append("Hired: ").append(worker.getHired()).append(";").append("</line>")
                .append(System.lineSeparator())
                .append("<line>").append("Fired: ").append(worker.getFired()).append(";").append("</line>")
                .append(System.lineSeparator())
                .append("<line>").append("Salary: ").append(worker.getSalary()).append(";").append("</line>")
                .append(System.lineSeparator())
                .append("</employee>")
                .append(System.lineSeparator())
                .append("</report>")
                .append(System.lineSeparator());
        assertThat(engine.generate(em -> true, xml, dev), is(expect.toString()));
    }

    @Test
    public void whenGenerateReportForHRDepartmentInJsonFormat() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report json = new ReportJson();
        Department hr = new HRDepartment();
        ReportEngine engine = new ReportEngine(store);
        StringBuilder expect = new StringBuilder()
                .append("{ report: [")
                .append(System.lineSeparator())
                .append("Name: ").append(worker.getName()).append(";")
                .append(System.lineSeparator())
                .append("Salary: ").append(worker.getSalary()).append(";")
                .append(System.lineSeparator())
                .append("] }")
                .append(System.lineSeparator());
        assertThat(engine.generate(em -> true, json, hr), is(expect.toString()));
    }
}
