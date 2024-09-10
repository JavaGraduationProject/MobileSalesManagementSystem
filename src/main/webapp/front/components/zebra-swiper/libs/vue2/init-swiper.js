import Swiper from '../../index.js';
import {
	needsNavigation,
	needsPagination,
	needsScrollbar
} from './utils.js';

function initSwiper(swiperParams, native) {
	return new Swiper(swiperParams, native);
}

function mountSwiper({
	el,
	nextEl,
	prevEl,
	paginationEl,
	scrollbarEl,
	swiper
}, swiperParams) {
	if (needsNavigation(swiperParams) && nextEl && prevEl) {
		swiper.params.navigation.nextEl = nextEl;
		swiper.originalParams.navigation.nextEl = nextEl;
		swiper.params.navigation.prevEl = prevEl;
		swiper.originalParams.navigation.prevEl = prevEl;
	}
	if (needsPagination(swiperParams) && paginationEl) {
		swiper.params.pagination.el = paginationEl;
		swiper.originalParams.pagination.el = paginationEl;
	}
	if (needsScrollbar(swiperParams) && scrollbarEl) {
		swiper.params.scrollbar.el = scrollbarEl;
		swiper.originalParams.scrollbar.el = scrollbarEl;
	}
	swiper.init(el);
}

export {
	initSwiper,
	mountSwiper
};
