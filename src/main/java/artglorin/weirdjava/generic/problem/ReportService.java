package artglorin.weirdjava.generic.problem;

import java.util.List;

// tag::include[]
interface ReportService {

    String createReport(List<? extends Resource> resources);

}
// end::include[]
