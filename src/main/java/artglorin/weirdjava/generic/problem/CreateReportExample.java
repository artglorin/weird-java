package artglorin.weirdjava.generic.problem;

import java.net.URI;
import java.util.List;

class CreateReportExample {

    private final ResourceFactory factory = new ResourceFactoryImpl();
    private final ReportService reportService = new ReportServiceImpl();

    public void example() {
        // tag::example[]
        String report = reportService.createReport(
                factory.createResource(
                        URI.create("file:/share/doc.txt")
                )
        );
        // end::example[]
    }

    public static void main(String[] args) {
        new CreateReportExample().example();
    }

    public void cast() {
        // tag::cast[]
        String report = reportService.createReport(
                (Resource & List<? extends Resource>) factory.createResource(
                        URI.create("file:/share/doc.txt")
                )
        );
        // end::cast[]
    }
}
