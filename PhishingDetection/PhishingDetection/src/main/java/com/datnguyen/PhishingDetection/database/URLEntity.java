package com.datnguyen.PhishingDetection.database;

import jakarta.persistence.*;

import java.sql.ResultSet;
import java.sql.SQLException;

@Entity
@Table(name = "dataset")
public class URLEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String url;

    @Column(name = "length_url")
    private Integer lengthUrl;
    @Column(name = "length_hostname")
    private Integer lengthHostname;

    @Column(name = "ip")
    private Integer ip;

    @Column(name = "nb_dots")
    private Integer nbDots;

    @Column(name = "nb_hyphens")
    private Integer nbHyphens;

    @Column(name = "nb_at")
    private Integer nbAt;

    @Column(name = "nb_qm")
    private Integer nbQm;

    @Column(name = "nb_and")
    private Integer nbAnd;

    @Column(name = "nb_or")
    private Integer nbOr;

    @Column(name = "nb_eq")
    private Integer nbEq;

    @Column(name = "nb_underscore")
    private Integer nbUnderscore;

    @Column(name = "nb_tilde")
    private Integer nbTilde;

    @Column(name = "nb_percent")
    private Integer nbPercent;

    @Column(name = "nb_slash")
    private Integer nbSlash;

    @Column(name = "nb_star")
    private Integer nbStar;

    @Column(name = "nb_colon")
    private Integer nbColon;

    @Column(name = "nb_comma")
    private Integer nbComma;

    @Column(name = "nb_semicolumn")
    private Integer nbsemicolumn;

    @Column(name = "nb_dollar")
    private Integer nbDollar;

    @Column(name = "nb_space")
    private Integer nbSpace;

    @Column(name = "nb_www")
    private Integer nbWww;

    @Column(name = "nb_com")
    private Integer nbCom;

    @Column(name = "nb_dslash")
    private Integer nbDslash;

    @Column(name = "http_in_path")
    private Integer httpInPath;

    @Column(name = "https_token")
    private Integer httpsToken;

    @Column(name = "ratio_digits_url")
    private Float ratioDigitsUrl;

    @Column(name = "ratio_digits_host")
    private Float ratioDigitsHost;

    @Column(name = "punycode")
    private Integer punycode;

    @Column(name = "port")
    private Integer port;

    @Column(name = "tld_in_path")
    private Integer tldInPath;

    @Column(name = "tld_in_subdomain")
    private Integer tldInSubdomain;

    @Column(name = "abnormal_subdomain")
    private Integer abnormalSubdomain;

    @Column(name = "nb_subdomains")
    private Integer nbSubdomains;

    @Column(name = "prefix_suffix")
    private Integer prefixSuffix;

    @Column(name = "random_domain")
    private Integer randomDomain;

    @Column(name = "shortening_service")
    private Integer shorteningService;

    @Column(name = "path_extension")
    private Integer pathExtension;

    @Column(name = "nb_redirection")
    private Integer nbRedirection;

    @Column(name = "nb_external_redirection")
    private Integer nbExternalRedirection;

    @Column(name = "length_words_raw")
    private Integer lengthWordsRaw;

    @Column(name = "char_repeat")
    private Integer charRepeat;

    @Column(name = "shortest_words_raw")
    private Integer shortestWordsRaw;

    @Column(name = "shortest_word_host")
    private Integer shortestWordHost;

    @Column(name = "shortest_word_path")
    private Integer shortestWordPath;

    @Column(name = "longest_words_raw")
    private Integer longestWordsRaw;

    @Column(name = "longest_word_host")
    private Integer longestWordHost;

    @Column(name = "longest_word_path")
    private Integer longestWordPath;

    @Column(name = "avg_words_raw")
    private Float avgWordsRaw;

    @Column(name = "avg_word_host")
    private Float avgWordHost;

    @Column(name = "avg_word_path")
    private Float avgWordPath;

    @Column(name = "phish_hints")
    private Integer phishHints;
    @Column(name = "domain_in_brand")
    private Integer domainInBrand;
    @Column(name = "brand_in_subdomain")
    private Integer brandInSubdomain;
    @Column(name = "brand_in_path")
    private Integer brandInPath;
    @Column(name = "suspecious_tld")
    private Integer suspiciousTld;
    @Column(name = "statistical_report")
    private Integer statisticalReport;

    @Column(name = "nb_hyperlinks")
    private Integer nbHyperlinks;

    @Column(name = "ratio_intHyperlinks")
    private Float ratioIntHyperlinks;

    @Column(name = "ratio_extHyperlinks")
    private Float ratioExtHyperlinks;

    @Column(name = "ratio_nullHyperlinks")
    private Integer ratioNullHyperlinks;

    @Column(name = "nb_extCSS")
    private Integer nbExtCSS;

    @Column(name = "ratio_intRedirection")
    private Integer ratioIntRedirection;

    @Column(name = "ratio_extRedirection")
    private Float ratioExtRedirection;

    @Column(name = "ratio_intErrors")
    private Integer ratioIntErrors;

    @Column(name = "ratio_extErrors")
    private Float ratioExtErrors;

    @Column(name = "login_form")
    private Integer loginForm;

    @Column(name = "external_favicon")
    private Integer externalFavicon;

    @Column(name = "links_in_tags")
    private Float linksInTags;

    @Column(name = "submit_email")
    private Integer submitEmail;

    @Column(name = "ratio_intMedia")
    private Float ratioIntMedia;

    @Column(name = "ratio_extMedia")
    private Float ratioExtMedia;

    @Column(name = "sfh")
    private Integer sfh;

    @Column(name = "iframe")
    private Integer iframe;

    @Column(name = "popup_window")
    private Integer popupWindow;

    @Column(name = "safe_anchor")
    private Float safeAnchor;

    @Column(name = "onmouseover")
    private Integer onMouseOver;

    @Column(name = "right_clic")
    private Integer rightClick;

    @Column(name = "empty_title")
    private Integer emptyTitle;

    @Column(name = "domain_in_title")
    private Integer domainInTitle;

    @Column(name = "domain_with_copyright")
    private Integer domainWithCopyright;

    @Column(name = "whois_registered_domain")
    private Integer whoisRegisteredDomain;

    @Column(name = "domain_registration_length")
    private Integer domainRegistrationLength;

    @Column(name = "domain_age")
    private Integer domainAge;

    @Column(name = "web_traffic")
    private Integer webTraffic;

    @Column(name = "dns_record")
    private Integer dnsRecord;

    @Column(name = "google_index")
    private Integer googleIndex;

    @Column(name = "page_rank")
    private Integer pageRank;

    @Column(name = "status")
    private String status;

    public URLEntity(){}

    public URLEntity(String url, Integer lengthUrl, Integer lengthHostname, Integer ip, Integer nbDots, Integer nbHyphens, Integer nbAt, Integer nbQm, Integer nbAnd, Integer nbOr, Integer nbEq, Integer nbUnderscore, Integer nbTilde, Integer nbPercent, Integer nbSlash, Integer nbStar, Integer nbColon, Integer nbComma, Integer nbsemicolumn, Integer nbDollar, Integer nbSpace, Integer nbWww, Integer nbCom, Integer nbDslash, Integer httpInPath, Integer httpsToken, Float ratioDigitsUrl, Float ratioDigitsHost, Integer punycode, Integer port, Integer tldInPath, Integer tldInSubdomain, Integer abnormalSubdomain, Integer nbSubdomains, Integer prefixSuffix, Integer randomDomain, Integer shorteningService, Integer pathExtension, Integer nbRedirection, Integer nbExternalRedirection, Integer lengthWordsRaw, Integer charRepeat, Integer shortestWordsRaw, Integer shortestWordHost, Integer shortestWordPath, Integer longestWordsRaw, Integer longestWordHost, Integer longestWordPath, Float avgWordsRaw, Float avgWordHost, Float avgWordPath, Integer phishHints, Integer domainInBrand, Integer brandInSubdomain, Integer brandInPath, Integer suspiciousTld, Integer statisticalReport, Integer nbHyperlinks, Float ratioIntHyperlinks, Float ratioExtHyperlinks, Integer ratioNullHyperlinks, Integer nbExtCSS, Integer ratioIntRedirection, Float ratioExtRedirection, Integer ratioIntErrors, Float ratioExtErrors, Integer loginForm, Integer externalFavicon, Float linksInTags, Integer submitEmail, Float ratioIntMedia, Float ratioExtMedia, Integer sfh, Integer iframe, Integer popupWindow, Float safeAnchor, Integer onMouseOver, Integer rightClick, Integer emptyTitle, Integer domainInTitle, Integer domainWithCopyright, Integer whoisRegisteredDomain, Integer domainRegistrationLength, Integer domainAge, Integer webTraffic, Integer dnsRecord, Integer googleIndex, Integer pageRank, String status) {
        this.url = url;
        this.lengthUrl = lengthUrl;
        this.lengthHostname = lengthHostname;
        this.ip = ip;
        this.nbDots = nbDots;
        this.nbHyphens = nbHyphens;
        this.nbAt = nbAt;
        this.nbQm = nbQm;
        this.nbAnd = nbAnd;
        this.nbOr = nbOr;
        this.nbEq = nbEq;
        this.nbUnderscore = nbUnderscore;
        this.nbTilde = nbTilde;
        this.nbPercent = nbPercent;
        this.nbSlash = nbSlash;
        this.nbStar = nbStar;
        this.nbColon = nbColon;
        this.nbComma = nbComma;
        this.nbsemicolumn = nbsemicolumn;
        this.nbDollar = nbDollar;
        this.nbSpace = nbSpace;
        this.nbWww = nbWww;
        this.nbCom = nbCom;
        this.nbDslash = nbDslash;
        this.httpInPath = httpInPath;
        this.httpsToken = httpsToken;
        this.ratioDigitsUrl = ratioDigitsUrl;
        this.ratioDigitsHost = ratioDigitsHost;
        this.punycode = punycode;
        this.port = port;
        this.tldInPath = tldInPath;
        this.tldInSubdomain = tldInSubdomain;
        this.abnormalSubdomain = abnormalSubdomain;
        this.nbSubdomains = nbSubdomains;
        this.prefixSuffix = prefixSuffix;
        this.randomDomain = randomDomain;
        this.shorteningService = shorteningService;
        this.pathExtension = pathExtension;
        this.nbRedirection = nbRedirection;
        this.nbExternalRedirection = nbExternalRedirection;
        this.lengthWordsRaw = lengthWordsRaw;
        this.charRepeat = charRepeat;
        this.shortestWordsRaw = shortestWordsRaw;
        this.shortestWordHost = shortestWordHost;
        this.shortestWordPath = shortestWordPath;
        this.longestWordsRaw = longestWordsRaw;
        this.longestWordHost = longestWordHost;
        this.longestWordPath = longestWordPath;
        this.avgWordsRaw = avgWordsRaw;
        this.avgWordHost = avgWordHost;
        this.avgWordPath = avgWordPath;
        this.phishHints = phishHints;
        this.domainInBrand = domainInBrand;
        this.brandInSubdomain = brandInSubdomain;
        this.brandInPath = brandInPath;
        this.suspiciousTld = suspiciousTld;
        this.statisticalReport = statisticalReport;
        this.nbHyperlinks = nbHyperlinks;
        this.ratioIntHyperlinks = ratioIntHyperlinks;
        this.ratioExtHyperlinks = ratioExtHyperlinks;
        this.ratioNullHyperlinks = ratioNullHyperlinks;
        this.nbExtCSS = nbExtCSS;
        this.ratioIntRedirection = ratioIntRedirection;
        this.ratioExtRedirection = ratioExtRedirection;
        this.ratioIntErrors = ratioIntErrors;
        this.ratioExtErrors = ratioExtErrors;
        this.loginForm = loginForm;
        this.externalFavicon = externalFavicon;
        this.linksInTags = linksInTags;
        this.submitEmail = submitEmail;
        this.ratioIntMedia = ratioIntMedia;
        this.ratioExtMedia = ratioExtMedia;
        this.sfh = sfh;
        this.iframe = iframe;
        this.popupWindow = popupWindow;
        this.safeAnchor = safeAnchor;
        this.onMouseOver = onMouseOver;
        this.rightClick = rightClick;
        this.emptyTitle = emptyTitle;
        this.domainInTitle = domainInTitle;
        this.domainWithCopyright = domainWithCopyright;
        this.whoisRegisteredDomain = whoisRegisteredDomain;
        this.domainRegistrationLength = domainRegistrationLength;
        this.domainAge = domainAge;
        this.webTraffic = webTraffic;
        this.dnsRecord = dnsRecord;
        this.googleIndex = googleIndex;
        this.pageRank = pageRank;
        this.status = status;
    }

    public URLEntity(ResultSet resultSet) throws SQLException {
        this.url = resultSet.getString("url");
        this.lengthUrl = resultSet.getInt("length_url");
        this.lengthHostname = resultSet.getInt("length_hostname");
        this.ip = resultSet.getInt("ip");
        this.nbDots = resultSet.getInt("nb_dots");
        this.nbHyphens = resultSet.getInt("nb_hyphens");
        this.nbAt = resultSet.getInt("nb_at");
        this.nbQm = resultSet.getInt("nb_qm");
        this.nbAnd = resultSet.getInt("nb_and");
        this.nbOr = resultSet.getInt("nb_or");
        this.nbEq = resultSet.getInt("nb_eq");
        this.nbUnderscore = resultSet.getInt("nb_underscore");
        this.nbTilde = resultSet.getInt("nb_tilde");
        this.nbPercent = resultSet.getInt("nb_percent");
        this.nbSlash = resultSet.getInt("nb_slash");
        this.nbStar = resultSet.getInt("nb_star");
        this.nbColon = resultSet.getInt("nb_colon");
        this.nbComma = resultSet.getInt("nb_comma");
        this.nbsemicolumn = resultSet.getInt("nb_semicolumn");
        this.nbDollar = resultSet.getInt("nb_dollar");
        this.nbSpace = resultSet.getInt("nb_space");
        this.nbWww = resultSet.getInt("nb_www");
        this.nbCom = resultSet.getInt("nb_com");
        this.nbDslash = resultSet.getInt("nb_dslash");
        this.httpInPath = resultSet.getInt("http_in_path");
        this.httpsToken = resultSet.getInt("https_token");
        this.ratioDigitsUrl = resultSet.getFloat("ratio_digits_url");
        this.ratioDigitsHost = resultSet.getFloat("ratio_digits_host");
        this.punycode = resultSet.getInt("punycode");
        this.port = resultSet.getInt("port");
        this.tldInPath = resultSet.getInt("tld_in_path");
        this.tldInSubdomain = resultSet.getInt("tld_in_subdomain");
        this.abnormalSubdomain = resultSet.getInt("abnormal_subdomain");
        this.nbSubdomains = resultSet.getInt("nb_subdomains");
        this.prefixSuffix = resultSet.getInt("prefix_suffix");
        this.randomDomain = resultSet.getInt("random_domain");
        this.shorteningService = resultSet.getInt("shortening_service");
        this.pathExtension = resultSet.getInt("path_extension");
        this.nbRedirection = resultSet.getInt("nb_redirection");
        this.nbExternalRedirection = resultSet.getInt("nb_external_redirection");
        this.lengthWordsRaw = resultSet.getInt("length_words_raw");
        this.charRepeat = resultSet.getInt("char_repeat");
        this.shortestWordsRaw = resultSet.getInt("shortest_words_raw");
        this.shortestWordHost = resultSet.getInt("shortest_word_host");
        this.shortestWordPath = resultSet.getInt("shortest_word_path");
        this.longestWordsRaw = resultSet.getInt("longest_words_raw");
        this.longestWordHost = resultSet.getInt("longest_word_host");
        this.longestWordPath = resultSet.getInt("longest_word_path");
        this.avgWordsRaw = resultSet.getFloat("avg_words_raw");
        this.avgWordHost = resultSet.getFloat("avg_word_host");
        this.avgWordPath = resultSet.getFloat("avg_word_path");
        this.phishHints = resultSet.getInt("phish_hints");
        this.domainInBrand = resultSet.getInt("domain_in_brand");
        this.brandInSubdomain = resultSet.getInt("brand_in_subdomain");
        this.brandInPath = resultSet.getInt("brand_in_path");
        this.suspiciousTld = resultSet.getInt("suspecious_tld");
        this.statisticalReport = resultSet.getInt("statistical_report");
        this.nbHyperlinks = resultSet.getInt("nb_hyperlinks");
        this.ratioIntHyperlinks = resultSet.getFloat("ratio_intHyperlinks");
        this.nbHyperlinks = resultSet.getInt("nb_hyperlinks");
        this.ratioIntHyperlinks = resultSet.getFloat("ratio_intHyperlinks");
        this.ratioExtHyperlinks = resultSet.getFloat("ratio_extHyperlinks");
        this.ratioNullHyperlinks = resultSet.getInt("ratio_nullHyperlinks");
        this.nbExtCSS = resultSet.getInt("nb_extCSS");
        this.ratioIntRedirection = resultSet.getInt("ratio_intRedirection");
        this.ratioExtRedirection = resultSet.getFloat("ratio_extRedirection");
        this.ratioIntErrors = resultSet.getInt("ratio_intErrors");
        this.ratioExtErrors = resultSet.getFloat("ratio_extErrors");
        this.loginForm = resultSet.getInt("login_form");
        this.externalFavicon = resultSet.getInt("external_favicon");
        this.linksInTags = resultSet.getFloat("links_in_tags");
        this.submitEmail = resultSet.getInt("submit_email");
        this.ratioIntMedia = resultSet.getFloat("ratio_intMedia");
        this.ratioExtMedia = resultSet.getFloat("ratio_extMedia");
        this.sfh = resultSet.getInt("sfh");
        this.iframe = resultSet.getInt("iframe");
        this.popupWindow = resultSet.getInt("popup_window");
        this.safeAnchor = resultSet.getFloat("safe_anchor");
        this.onMouseOver = resultSet.getInt("onMouseOver");
        this.rightClick = resultSet.getInt("right_clic");
        this.emptyTitle = resultSet.getInt("empty_title");
        this.domainInTitle = resultSet.getInt("domain_in_title");
        this.domainWithCopyright = resultSet.getInt("domain_with_copyright");
        this.whoisRegisteredDomain = resultSet.getInt("whois_registered_domain");
        this.domainRegistrationLength = resultSet.getInt("domain_registration_length");
        this.domainAge = resultSet.getInt("domain_age");
        this.webTraffic = resultSet.getInt("web_traffic");
        this.dnsRecord = resultSet.getInt("dns_record");
        this.googleIndex = resultSet.getInt("google_index");
        this.pageRank = resultSet.getInt("page_rank");
        this.status = resultSet.getString("status");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLengthUrl() {
        return lengthUrl;
    }

    public void setLengthUrl(Integer lengthUrl) {
        this.lengthUrl = lengthUrl;
    }

    public Integer getLengthHostname() {
        return lengthHostname;
    }

    public void setLengthHostname(Integer lengthHostname) {
        this.lengthHostname = lengthHostname;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Integer getNbDots() {
        return nbDots;
    }

    public void setNbDots(Integer nbDots) {
        this.nbDots = nbDots;
    }

    public Integer getNbHyphens() {
        return nbHyphens;
    }

    public void setNbHyphens(Integer nbHyphens) {
        this.nbHyphens = nbHyphens;
    }

    public Integer getNbAt() {
        return nbAt;
    }

    public void setNbAt(Integer nbAt) {
        this.nbAt = nbAt;
    }

    public Integer getNbQm() {
        return nbQm;
    }

    public void setNbQm(Integer nbQm) {
        this.nbQm = nbQm;
    }

    public Integer getNbAnd() {
        return nbAnd;
    }

    public void setNbAnd(Integer nbAnd) {
        this.nbAnd = nbAnd;
    }

    public Integer getNbOr() {
        return nbOr;
    }

    public void setNbOr(Integer nbOr) {
        this.nbOr = nbOr;
    }

    public Integer getNbEq() {
        return nbEq;
    }

    public void setNbEq(Integer nbEq) {
        this.nbEq = nbEq;
    }

    public Integer getNbUnderscore() {
        return nbUnderscore;
    }

    public void setNbUnderscore(Integer nbUnderscore) {
        this.nbUnderscore = nbUnderscore;
    }

    public Integer getNbTilde() {
        return nbTilde;
    }

    public void setNbTilde(Integer nbTilde) {
        this.nbTilde = nbTilde;
    }

    public Integer getNbPercent() {
        return nbPercent;
    }

    public void setNbPercent(Integer nbPercent) {
        this.nbPercent = nbPercent;
    }

    public Integer getNbSlash() {
        return nbSlash;
    }

    public void setNbSlash(Integer nbSlash) {
        this.nbSlash = nbSlash;
    }

    public Integer getNbStar() {
        return nbStar;
    }

    public void setNbStar(Integer nbStar) {
        this.nbStar = nbStar;
    }

    public Integer getNbColon() {
        return nbColon;
    }

    public void setNbColon(Integer nbColon) {
        this.nbColon = nbColon;
    }

    public Integer getNbComma() {
        return nbComma;
    }

    public void setNbComma(Integer nbComma) {
        this.nbComma = nbComma;
    }

    public Integer getNbsemicolumn() {
        return nbsemicolumn;
    }

    public void setNbsemicolumn(Integer nbsemicolumn) {
        this.nbsemicolumn = nbsemicolumn;
    }

    public Integer getNbDollar() {
        return nbDollar;
    }

    public void setNbDollar(Integer nbDollar) {
        this.nbDollar = nbDollar;
    }

    public Integer getNbSpace() {
        return nbSpace;
    }

    public void setNbSpace(Integer nbSpace) {
        this.nbSpace = nbSpace;
    }

    public Integer getNbWww() {
        return nbWww;
    }

    public void setNbWww(Integer nbWww) {
        this.nbWww = nbWww;
    }

    public Integer getNbCom() {
        return nbCom;
    }

    public void setNbCom(Integer nbCom) {
        this.nbCom = nbCom;
    }

    public Integer getNbDslash() {
        return nbDslash;
    }

    public void setNbDslash(Integer nbDslash) {
        this.nbDslash = nbDslash;
    }

    public Integer getHttpInPath() {
        return httpInPath;
    }

    public void setHttpInPath(Integer httpInPath) {
        this.httpInPath = httpInPath;
    }

    public Integer getHttpsToken() {
        return httpsToken;
    }

    public void setHttpsToken(Integer httpsToken) {
        this.httpsToken = httpsToken;
    }

    public Float getRatioDigitsUrl() {
        return ratioDigitsUrl;
    }

    public void setRatioDigitsUrl(Float ratioDigitsUrl) {
        this.ratioDigitsUrl = ratioDigitsUrl;
    }

    public Float getRatioDigitsHost() {
        return ratioDigitsHost;
    }

    public void setRatioDigitsHost(Float ratioDigitsHost) {
        this.ratioDigitsHost = ratioDigitsHost;
    }

    public Integer getPunycode() {
        return punycode;
    }

    public void setPunycode(Integer punycode) {
        this.punycode = punycode;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTldInPath() {
        return tldInPath;
    }

    public void setTldInPath(Integer tldInPath) {
        this.tldInPath = tldInPath;
    }

    public Integer getTldInSubdomain() {
        return tldInSubdomain;
    }

    public void setTldInSubdomain(Integer tldInSubdomain) {
        this.tldInSubdomain = tldInSubdomain;
    }

    public Integer getAbnormalSubdomain() {
        return abnormalSubdomain;
    }

    public void setAbnormalSubdomain(Integer abnormalSubdomain) {
        this.abnormalSubdomain = abnormalSubdomain;
    }

    public Integer getNbSubdomains() {
        return nbSubdomains;
    }

    public void setNbSubdomains(Integer nbSubdomains) {
        this.nbSubdomains = nbSubdomains;
    }

    public Integer getPrefixSuffix() {
        return prefixSuffix;
    }

    public void setPrefixSuffix(Integer prefixSuffix) {
        this.prefixSuffix = prefixSuffix;
    }

    public Integer getRandomDomain() {
        return randomDomain;
    }

    public void setRandomDomain(Integer randomDomain) {
        this.randomDomain = randomDomain;
    }

    public Integer getShorteningService() {
        return shorteningService;
    }

    public void setShorteningService(Integer shorteningService) {
        this.shorteningService = shorteningService;
    }

    public Integer getPathExtension() {
        return pathExtension;
    }

    public void setPathExtension(Integer pathExtension) {
        this.pathExtension = pathExtension;
    }

    public Integer getNbRedirection() {
        return nbRedirection;
    }

    public void setNbRedirection(Integer nbRedirection) {
        this.nbRedirection = nbRedirection;
    }

    public Integer getNbExternalRedirection() {
        return nbExternalRedirection;
    }

    public void setNbExternalRedirection(Integer nbExternalRedirection) {
        this.nbExternalRedirection = nbExternalRedirection;
    }

    public Integer getLengthWordsRaw() {
        return lengthWordsRaw;
    }

    public void setLengthWordsRaw(Integer lengthWordsRaw) {
        this.lengthWordsRaw = lengthWordsRaw;
    }

    public Integer getCharRepeat() {
        return charRepeat;
    }

    public void setCharRepeat(Integer charRepeat) {
        this.charRepeat = charRepeat;
    }

    public Integer getShortestWordsRaw() {
        return shortestWordsRaw;
    }

    public void setShortestWordsRaw(Integer shortestWordsRaw) {
        this.shortestWordsRaw = shortestWordsRaw;
    }

    public Integer getShortestWordHost() {
        return shortestWordHost;
    }

    public void setShortestWordHost(Integer shortestWordHost) {
        this.shortestWordHost = shortestWordHost;
    }

    public Integer getShortestWordPath() {
        return shortestWordPath;
    }

    public void setShortestWordPath(Integer shortestWordPath) {
        this.shortestWordPath = shortestWordPath;
    }

    public Integer getLongestWordsRaw() {
        return longestWordsRaw;
    }

    public void setLongestWordsRaw(Integer longestWordsRaw) {
        this.longestWordsRaw = longestWordsRaw;
    }

    public Integer getLongestWordHost() {
        return longestWordHost;
    }

    public void setLongestWordHost(Integer longestWordHost) {
        this.longestWordHost = longestWordHost;
    }

    public Integer getLongestWordPath() {
        return longestWordPath;
    }

    public void setLongestWordPath(Integer longestWordPath) {
        this.longestWordPath = longestWordPath;
    }

    public Float getAvgWordsRaw() {
        return avgWordsRaw;
    }

    public void setAvgWordsRaw(Float avgWordsRaw) {
        this.avgWordsRaw = avgWordsRaw;
    }

    public Float getAvgWordHost() {
        return avgWordHost;
    }

    public void setAvgWordHost(Float avgWordHost) {
        this.avgWordHost = avgWordHost;
    }

    public Float getAvgWordPath() {
        return avgWordPath;
    }

    public void setAvgWordPath(Float avgWordPath) {
        this.avgWordPath = avgWordPath;
    }

    public Integer getPhishHints() {
        return phishHints;
    }

    public void setPhishHints(Integer phishHints) {
        this.phishHints = phishHints;
    }

    public Integer getDomainInBrand() {
        return domainInBrand;
    }

    public void setDomainInBrand(Integer domainInBrand) {
        this.domainInBrand = domainInBrand;
    }

    public Integer getBrandInSubdomain() {
        return brandInSubdomain;
    }

    public void setBrandInSubdomain(Integer brandInSubdomain) {
        this.brandInSubdomain = brandInSubdomain;
    }

    public Integer getBrandInPath() {
        return brandInPath;
    }

    public void setBrandInPath(Integer brandInPath) {
        this.brandInPath = brandInPath;
    }

    public Integer getSuspiciousTld() {
        return suspiciousTld;
    }

    public void setSuspiciousTld(Integer suspiciousTld) {
        this.suspiciousTld = suspiciousTld;
    }

    public Integer getStatisticalReport() {
        return statisticalReport;
    }

    public void setStatisticalReport(Integer statisticalReport) {
        this.statisticalReport = statisticalReport;
    }

    public Integer getNbHyperlinks() {
        return nbHyperlinks;
    }

    public void setNbHyperlinks(Integer nbHyperlinks) {
        this.nbHyperlinks = nbHyperlinks;
    }

    public Float getRatioIntHyperlinks() {
        return ratioIntHyperlinks;
    }

    public void setRatioIntHyperlinks(Float ratioIntHyperlinks) {
        this.ratioIntHyperlinks = ratioIntHyperlinks;
    }

    public Float getRatioExtHyperlinks() {
        return ratioExtHyperlinks;
    }

    public void setRatioExtHyperlinks(Float ratioExtHyperlinks) {
        this.ratioExtHyperlinks = ratioExtHyperlinks;
    }

    public Integer getRatioNullHyperlinks() {
        return ratioNullHyperlinks;
    }

    public void setRatioNullHyperlinks(Integer ratioNullHyperlinks) {
        this.ratioNullHyperlinks = ratioNullHyperlinks;
    }

    public Integer getNbExtCSS() {
        return nbExtCSS;
    }

    public void setNbExtCSS(Integer nbExtCSS) {
        this.nbExtCSS = nbExtCSS;
    }

    public Integer getRatioIntRedirection() {
        return ratioIntRedirection;
    }

    public void setRatioIntRedirection(Integer ratioIntRedirection) {
        this.ratioIntRedirection = ratioIntRedirection;
    }

    public Float getRatioExtRedirection() {
        return ratioExtRedirection;
    }

    public void setRatioExtRedirection(Float ratioExtRedirection) {
        this.ratioExtRedirection = ratioExtRedirection;
    }

    public Integer getRatioIntErrors() {
        return ratioIntErrors;
    }

    public void setRatioIntErrors(Integer ratioIntErrors) {
        this.ratioIntErrors = ratioIntErrors;
    }

    public Float getRatioExtErrors() {
        return ratioExtErrors;
    }

    public void setRatioExtErrors(Float ratioExtErrors) {
        this.ratioExtErrors = ratioExtErrors;
    }

    public Integer getLoginForm() {
        return loginForm;
    }

    public void setLoginForm(Integer loginForm) {
        this.loginForm = loginForm;
    }

    public Integer getExternalFavicon() {
        return externalFavicon;
    }

    public void setExternalFavicon(Integer externalFavicon) {
        this.externalFavicon = externalFavicon;
    }

    public Float getLinksInTags() {
        return linksInTags;
    }

    public void setLinksInTags(Float linksInTags) {
        this.linksInTags = linksInTags;
    }

    public Integer getSubmitEmail() {
        return submitEmail;
    }

    public void setSubmitEmail(Integer submitEmail) {
        this.submitEmail = submitEmail;
    }

    public Float getRatioIntMedia() {
        return ratioIntMedia;
    }

    public void setRatioIntMedia(Float ratioIntMedia) {
        this.ratioIntMedia = ratioIntMedia;
    }

    public Float getRatioExtMedia() {
        return ratioExtMedia;
    }

    public void setRatioExtMedia(Float ratioExtMedia) {
        this.ratioExtMedia = ratioExtMedia;
    }

    public Integer getSfh() {
        return sfh;
    }

    public void setSfh(Integer sfh) {
        this.sfh = sfh;
    }

    public Integer getIframe() {
        return iframe;
    }

    public void setIframe(Integer iframe) {
        this.iframe = iframe;
    }

    public Integer getPopupWindow() {
        return popupWindow;
    }

    public void setPopupWindow(Integer popupWindow) {
        this.popupWindow = popupWindow;
    }

    public Float getSafeAnchor() {
        return safeAnchor;
    }

    public void setSafeAnchor(Float safeAnchor) {
        this.safeAnchor = safeAnchor;
    }

    public Integer getOnMouseOver() {
        return onMouseOver;
    }

    public void setOnMouseOver(Integer onMouseOver) {
        this.onMouseOver = onMouseOver;
    }

    public Integer getRightClick() {
        return rightClick;
    }

    public void setRightClick(Integer rightClick) {
        this.rightClick = rightClick;
    }

    public Integer getEmptyTitle() {
        return emptyTitle;
    }

    public void setEmptyTitle(Integer emptyTitle) {
        this.emptyTitle = emptyTitle;
    }

    public Integer getDomainInTitle() {
        return domainInTitle;
    }

    public void setDomainInTitle(Integer domainInTitle) {
        this.domainInTitle = domainInTitle;
    }

    public Integer getDomainWithCopyright() {
        return domainWithCopyright;
    }

    public void setDomainWithCopyright(Integer domainWithCopyright) {
        this.domainWithCopyright = domainWithCopyright;
    }

    public Integer getWhoisRegisteredDomain() {
        return whoisRegisteredDomain;
    }

    public void setWhoisRegisteredDomain(Integer whoisRegisteredDomain) {
        this.whoisRegisteredDomain = whoisRegisteredDomain;
    }

    public Integer getDomainRegistrationLength() {
        return domainRegistrationLength;
    }

    public void setDomainRegistrationLength(Integer domainRegistrationLength) {
        this.domainRegistrationLength = domainRegistrationLength;
    }

    public Integer getDomainAge() {
        return domainAge;
    }

    public void setDomainAge(Integer domainAge) {
        this.domainAge = domainAge;
    }

    public Integer getWebTraffic() {
        return webTraffic;
    }

    public void setWebTraffic(Integer webTraffic) {
        this.webTraffic = webTraffic;
    }

    public Integer getDnsRecord() {
        return dnsRecord;
    }

    public void setDnsRecord(Integer dnsRecord) {
        this.dnsRecord = dnsRecord;
    }

    public Integer getGoogleIndex() {
        return googleIndex;
    }

    public void setGoogleIndex(Integer googleIndex) {
        this.googleIndex = googleIndex;
    }

    public Integer getPageRank() {
        return pageRank;
    }

    public void setPageRank(Integer pageRank) {
        this.pageRank = pageRank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
