package apiassistence.com.example.apiassistence.request;


import java.io.Serializable;

public class NewCalledRequest implements Serializable {

    private String problem;
    private String description;
    private String addressOcorrencyLatLng;  // pegando latitude e longitude Noa sei se vai dar certo kk
    private String addressOcorrency;
    private String addressDestinyLatLng;  // pegando latitude e longitude Noa sei se vai dar certo kk
    private String addressDestiny;
    private float timeOcorrenncyXDestiny;
    private float distanceOcorrencyXDestiny;
    private float TimeProviderXOcorrency;
    private float distanceProviderXOcorrency;
    private float timeProviderXDestiny;
    private float distanceProviderXDestiny;
    private float timeOperation;
    private Integer status;

    // salvar cliente
    private String firstNameCli;
    private String fullNameCli;
    private String phoneCli;
    private String emailCli;
    private String statusPaymentsCli;
    private String statusCli;
    private String plateCli;
    private String modelCli;
    private String fuelCli;
    private String planCli;

    // inserir provedor mais nao salvar no banco de dados de provedores
    private Integer idProvider;

    // endereco do provedor tbm nao salvar
    private Integer idAddressProvider;

    public NewCalledRequest(){
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddressOcorrencyLatLng() {
        return addressOcorrencyLatLng;
    }

    public void setAddressOcorrencyLatLng(String addressOcorrencyLatLng) {
        this.addressOcorrencyLatLng = addressOcorrencyLatLng;
    }

    public String getAddressOcorrency() {
        return addressOcorrency;
    }

    public void setAddressOcorrency(String addressOcorrency) {
        this.addressOcorrency = addressOcorrency;
    }

    public String getAddressDestinyLatLng() {
        return addressDestinyLatLng;
    }

    public void setAddressDestinyLatLng(String addressDestinyLatLng) {
        this.addressDestinyLatLng = addressDestinyLatLng;
    }

    public String getAddressDestiny() {
        return addressDestiny;
    }

    public void setAddressDestiny(String addressDestiny) {
        this.addressDestiny = addressDestiny;
    }

    public float getTimeOcorrenncyXDestiny() {
        return timeOcorrenncyXDestiny;
    }

    public void setTimeOcorrenncyXDestiny(float timeOcorrenncyXDestiny) {
        this.timeOcorrenncyXDestiny = timeOcorrenncyXDestiny;
    }

    public float getDistanceOcorrencyXDestiny() {
        return distanceOcorrencyXDestiny;
    }

    public void setDistanceOcorrencyXDestiny(float distanceOcorrencyXDestiny) {
        this.distanceOcorrencyXDestiny = distanceOcorrencyXDestiny;
    }

    public float getTimeProviderXOcorrency() {
        return TimeProviderXOcorrency;
    }

    public void setTimeProviderXOcorrency(float timeProviderXOcorrency) {
        TimeProviderXOcorrency = timeProviderXOcorrency;
    }

    public float getDistanceProviderXOcorrency() {
        return distanceProviderXOcorrency;
    }

    public void setDistanceProviderXOcorrency(float distanceProviderXOcorrency) {
        this.distanceProviderXOcorrency = distanceProviderXOcorrency;
    }

    public float getTimeProviderXDestiny() {
        return timeProviderXDestiny;
    }

    public void setTimeProviderXDestiny(float timeProviderXDestiny) {
        this.timeProviderXDestiny = timeProviderXDestiny;
    }

    public float getDistanceProviderXDestiny() {
        return distanceProviderXDestiny;
    }

    public void setDistanceProviderXDestiny(float distanceProviderXDestiny) {
        this.distanceProviderXDestiny = distanceProviderXDestiny;
    }

    public float getTimeOperation() {
        return timeOperation;
    }

    public void setTimeOperation(float timeOperation) {
        this.timeOperation = timeOperation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFirstNameCli() {
        return firstNameCli;
    }

    public void setFirstNameCli(String firstNameCli) {
        this.firstNameCli = firstNameCli;
    }

    public String getFullNameCli() {
        return fullNameCli;
    }

    public void setFullNameCli(String fullNameCli) {
        this.fullNameCli = fullNameCli;
    }

    public String getPhoneCli() {
        return phoneCli;
    }

    public void setPhoneCli(String phoneCli) {
        this.phoneCli = phoneCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public String getStatusPaymentsCli() {
        return statusPaymentsCli;
    }

    public void setStatusPaymentsCli(String statusPaymentsCli) {
        this.statusPaymentsCli = statusPaymentsCli;
    }

    public String getStatusCli() {
        return statusCli;
    }

    public void setStatusCli(String statusCli) {
        this.statusCli = statusCli;
    }

    public String getPlateCli() {
        return plateCli;
    }

    public void setPlateCli(String plateCli) {
        this.plateCli = plateCli;
    }

    public String getModelCli() {
        return modelCli;
    }

    public void setModelCli(String modelCli) {
        this.modelCli = modelCli;
    }

    public String getFuelCli() {
        return fuelCli;
    }

    public void setFuelCli(String fuelCli) {
        this.fuelCli = fuelCli;
    }

    public String getPlanCli() {
        return planCli;
    }

    public void setPlanCli(String planCli) {
        this.planCli = planCli;
    }

    public Integer getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Integer idProvider) {
        this.idProvider = idProvider;
    }

    public Integer getIdAddressProvider() {
        return idAddressProvider;
    }

    public void setIdAddressProvider(Integer idAddressProvider) {
        this.idAddressProvider = idAddressProvider;
    }
}
