package com.smartx.tower;

final class ActivePassiveRequestTags {
    static final Bypass BYPASS = new Bypass();

    private ActivePassiveRequestTags() {}

    static final class Bypass {
        private Bypass() {}
    }
}
