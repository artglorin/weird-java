package artglorin.weirdjava.generic.solution.useinterface;

import java.net.URI;
import java.util.List;

class CreateReportExample {

    private final ResourceFactory factory = new ResourceFactoryImpl();
    private final ReportService reportService = new ReportServiceImpl();

    public void example() {
        // tag::example[]
        String report = reportService.createReport(
                List.of(
                        factory.createResource(
                                URI.create("file:/share/doc.txt")
                        )
                )
        );
        // end::example[]
    }

}
